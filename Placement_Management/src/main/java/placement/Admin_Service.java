package placement;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
@Transactional
public class Admin_Service
{
	 @Autowired
	  private Admin_Service_Repository repo;
	        
	      public List<Admin> listAll()
	      {
	    	  return repo.findAll();
	      }
	      
	      public void save(Admin admin)
	      {
	    	  repo.save(admin);
	      }
	      
	      public Admin get(Integer admin_Id)
	      {
	    	  return repo.findById(admin_Id).get();
	      }
	      
	      public void delete(Integer admin_Id)
	      {
	    	  repo.deleteById(admin_Id);
	      }
}
