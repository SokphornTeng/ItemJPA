package practiceJPA.JPAPractice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import practiceJPA.JPAPractice.Model.Request.transactionReq;
import practiceJPA.JPAPractice.Model.Response.transactionResponse;
import practiceJPA.JPAPractice.Model.TransactionEntity.Account;
import practiceJPA.JPAPractice.Service.TransactionService.transactionService;

@Controller
@RequestMapping("/transaction")
public class transactionController {

    private final transactionService _transactionService;
    public transactionController(transactionService transactionService) {
        _transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<transactionResponse> created(@RequestBody transactionReq req) throws Exception {
        Account newAccount = this._transactionService.create(req);
        return ResponseEntity.ok(transactionResponse.responseMethod(newAccount));
    }

}
