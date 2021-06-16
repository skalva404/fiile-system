package org.problems.swiggy;

import com.sun.jdi.VMOutOfMemoryException;

public interface IFile {

    public String getName();

    public int getSize();

    public void write(String content) throws VMOutOfMemoryException;

    public void print();

}
