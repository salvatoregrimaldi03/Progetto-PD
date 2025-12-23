package oggetti;

import java.io.Serializable;

public class MessageDTO implements Serializable {
    private int id;
    
    public MessageDTO(){
        
    }

    public MessageDTO(int id){
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }
}