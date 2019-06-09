package fileManagerBinary;

import dataSet.UserList;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReaderManager {

    private ObjectInputStream reader;

    public void open(String fileName) throws IOException {
        reader = new ObjectInputStream(new FileInputStream(fileName));
    }

    public UserList read() throws IOException, ClassNotFoundException {
        return (UserList) reader.readObject();
    }

    public void close() throws IOException {
        reader.close();
    }
}
