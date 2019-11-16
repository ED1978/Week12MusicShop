package money;

import money.notes.NoteType;

public abstract class Money{

    public IPay moneyType;
    private Double value;
    private String note;
    private String material;

    public Money(IPay moneyType, String material){
        this.moneyType = moneyType;
        this.value = getValueFromEnum();
        this.note = moneyType.toString();
        this.material = material;
    }

    public IPay getNoteType(){
        return this.moneyType;
    }

    public String getNote(){
        return this.note;
    }

    public Double getValueFromEnum(){
        return this.moneyType.getValue();
    }

    public Double getValue(){
        return this.value;
    }





}
