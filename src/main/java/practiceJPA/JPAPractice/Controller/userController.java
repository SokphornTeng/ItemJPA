package practiceJPA.JPAPractice.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import practiceJPA.JPAPractice.Model.Entity.User;
import practiceJPA.JPAPractice.Model.Request.userReq;
import practiceJPA.JPAPractice.Model.Response.userResponse;
import practiceJPA.JPAPractice.Service.userServiceImpl;

import java.util.List;

@Controller
@RequestMapping("/api/data")
public class userController {

    private final userServiceImpl _suserServiceImpl;

    public userController(userServiceImpl _suserServiceImpl) {
        this._suserServiceImpl = _suserServiceImpl;
    }

    @PostMapping
    public ResponseEntity<userResponse> addData(@RequestBody userReq stuRq){
    	User newStu = this._suserServiceImpl.createData(stuRq);
    	return ResponseEntity.ok(userResponse.methodResponse(newStu));
    }

    @GetMapping
    public ResponseEntity<Object> listingAll(){
    	List<userResponse> listAll = this._suserServiceImpl.getAll().stream().map(userResponse::methodResponse).toList();
    	return ResponseEntity.ok(listAll);
    }


    @PutMapping("/{id}")
    public ResponseEntity<userResponse> updateForm(@PathVariable("id") long id, @RequestBody userReq req) throws Exception {
        User updateUser = this._suserServiceImpl.updateInfor(id, req);
        return ResponseEntity.ok(userResponse.methodResponse(updateUser));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Object> deleteInfo(@PathVariable("id") Long id) {
    this._suserServiceImpl.deleteStudentById(id);
        return ResponseEntity.ok("Delelet successfully");
    }

    @DeleteMapping("/removeInfo/{id}")
    public ResponseEntity<userResponse> deleteInfor(@PathVariable("id") Long id) throws Exception {
        User removeData = this._suserServiceImpl.deleteData(id);
        return ResponseEntity.ok(userResponse.methodResponse(removeData));
    }

    @GetMapping("/{id}")
    public ResponseEntity<userResponse> getByOne(@PathVariable("id") Long id) throws Exception {
        User listByOne = this._suserServiceImpl.findByOne(id);
        return ResponseEntity.ok(userResponse.methodResponse(listByOne));
    }

}
