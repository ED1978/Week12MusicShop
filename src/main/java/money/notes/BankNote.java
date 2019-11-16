package money.notes;

public class BankNote {

    public NoteType noteType;
    private Double value;
    private String note;

    public BankNote(NoteType noteType){
        this.noteType = noteType;
        this.value = getValueFromEnum();
        this.note = noteType.toString();
    }

    public NoteType getNoteType(){
        return this.noteType;
    }

    public String getNote(){
        return this.note;
    }

    public Double getValueFromEnum(){
        return this.noteType.getValue();
    }





}
