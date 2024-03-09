package practiceJPA.JPAPractice.Service;

import practiceJPA.JPAPractice.Model.Entity.User;

public interface userService {

    void SaveInfo(User userList);
    User getStudentById(Long id) throws Exception;
    void deleteStudentById(Long id);

}
