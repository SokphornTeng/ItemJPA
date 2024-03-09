package practiceJPA.JPAPractice.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import practiceJPA.JPAPractice.Model.Entity.User;
import practiceJPA.JPAPractice.Model.Request.userReq;
import practiceJPA.JPAPractice.Repo.userRepo;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class userServiceImpl implements userService{

    private final userRepo repoUser;
    @Autowired
    public userServiceImpl(userRepo repoUser) {
        this.repoUser = repoUser;
    }

    public User createData(userReq stuReq) {
        User newInfo = stuReq.methodReq();
        return this.repoUser.save(newInfo);
    }

    public List<User> getAll(){
        List<User> getList = this.repoUser.findAll();
        return getList;
    }

    public User findByOne(Long id) throws Exception {
        return this.repoUser.findByIdAndDeletedAtIsNull(id).orElseThrow(() -> new Exception("Data not found"));
    }

    @Override
    public void SaveInfo(User userList) {
        this.repoUser.save(userList);
    }

    public User updateInfor(Long id, userReq myReq) throws Exception {
        User newUpdate = this.repoUser.findById(id).orElseThrow(() -> new Exception());

        newUpdate.setName(myReq.getName());
        newUpdate.setAge(myReq.getAge());
        newUpdate.setGrade(myReq.getGrade());
        return this.repoUser.save(newUpdate);
    }

    @Override
    public User getStudentById(Long id) throws Exception {
        Optional<User> updateStuInfo = this.repoUser.findById(id);
        User newInfo = null;
        if(updateStuInfo.isPresent()) {
            newInfo = updateStuInfo.get();
        } else {
            throw new Exception();
        }
        return newInfo;
    }


    @Override
    public void deleteStudentById(Long id) {
        this.repoUser.deleteById(id);

    }

    public User deleteData(Long id) throws Exception {
        User removeInfo = this.repoUser.findById(id).orElseThrow(() ->new Exception());
        try {
            removeInfo.setDeletedAt(new Date());
         this.repoUser.save(removeInfo);
        }catch (Exception e){
            throw new Exception();
        }
        return removeInfo;
    }

}
