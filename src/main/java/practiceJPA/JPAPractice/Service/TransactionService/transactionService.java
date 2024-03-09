package practiceJPA.JPAPractice.Service.TransactionService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import practiceJPA.JPAPractice.Model.Request.transactionReq;
import practiceJPA.JPAPractice.Model.TransactionEntity.Account;
import practiceJPA.JPAPractice.Repo.transactionRepo;

@Service
//it help to run fast or log data
@Transactional(readOnly = true)
public class transactionService {

    private final transactionRepo _transactionRepo;
    @Autowired
    public transactionService(transactionRepo transactionRepo) {
        _transactionRepo = transactionRepo;
    }

    // use for override for read only timeout it will transaction timeout expired
    @Transactional(timeout = 10, rollbackFor = {Exception.class})
    public Account create(transactionReq req) throws Exception {
        Account data = req.reqMethod();
       if(this._transactionRepo.existsByName(data.getName())){
           throw new Exception("Account name already exist");
       }
       try {
         return this._transactionRepo.save(data);

//           Account info = this._transactionRepo.save(data);
//           data.setName(null);
//           this._transactionRepo.save(data);
//           return info;

       }catch (Exception ex){
           throw new Exception();
       }
    }
    public Account update(Long id, transactionReq req){
        return  null;
    }
    public Account listAll(){
        return null;
    }
    public Account listByOne(Long id){
        return null;
    }
    public Account deleteData(Long id){
        return null;
    }
}
