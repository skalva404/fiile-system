package org.problems.swiggy;

public interface IFileSystem {

    public int getSpaceLeft();

    public IBlock requestMoreSpace(IFile file);

    public IFile createFile(String name, Class<? extends IFile> fileType);

    public void deleteFile(IFile file);

    public void list();

}
