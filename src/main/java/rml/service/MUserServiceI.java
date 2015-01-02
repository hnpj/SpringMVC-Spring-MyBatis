package rml.service;

import java.util.List;

import rml.model.MUser;
import rml.model.Page;

public interface MUserServiceI {

	List<MUser> getAll();
	List<MUser> findPage(Page<MUser> page);
	
	MUser selectByPrimaryKey(String id);
	
    int insert(MUser muser);
    
    int update(MUser muser);
    
    int delete(String id);
    
}
