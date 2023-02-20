package placement;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Admin_Service_Controller
{
	 @Autowired(required=true)
	  private Admin_Service service;
	  
	  @GetMapping("/adminservice")
	  public java.util.List<Admin>list()
	  {
		  return service.listAll();
	  }
	  @GetMapping("/adminservice/{admin_Id}")
	  public ResponseEntity <Admin> get(@PathVariable Integer Admin_Id)
	  {
		  try
		  {
			Admin admin = service.get(Admin_Id);
			return new ResponseEntity<Admin>(admin,HttpStatus.OK);
		  }
		  catch(NoResultException e)
		  {
			  return new ResponseEntity<Admin>(HttpStatus.NOT_FOUND);
		  }
	   
	  }
		  @PostMapping("/adminservice")
		  public void add(@RequestBody Admin admin)
		  {
			  service.save(admin);
		  }
		  @PutMapping ("/adminservice/{admin_Id}")
		  public ResponseEntity<?> update(@RequestBody Admin admin, @PathVariable Integer Admin_Id)
		  {
			  Admin existadmin = service.get(Admin_Id);
			  service.save(existadmin);
			  return new ResponseEntity<>(HttpStatus.OK);
		  }
		  @DeleteMapping("/adminservice/{admin_Id}")
		  public void delete (@PathVariable Integer admin_Id)
		  {
			  service.delete(admin_Id);
		  }
}
