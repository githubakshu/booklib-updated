package com.first.ourtry;

import java.util.List;

import com.first.ourtry.*;

public interface LibraryService {

    public List<Library> getAll();

    public Library save(Library library);

    public Library find(long id);

    public void delete(long id);

}