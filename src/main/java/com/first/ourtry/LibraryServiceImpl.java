package com.first.ourtry;


import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.first.ourtry.LibraryService;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service("LibraryService")


public class LibraryServiceImpl implements LibraryService {

    @Autowired
    private Libraryrepository libraryrepository;

@Override
    public List<Library> getAll(){
        return libraryrepository.findAll();


    }

@Override
    public Library save(Library library){
        return libraryrepository.saveAndFlush(library);


    }
@Override
    public Library find(long id){
         return libraryrepository.findOne(id);


    }
@Override
    public void delete(long id){
         libraryrepository.delete(id);

    
   }

}