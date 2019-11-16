package money.notes;

import money.IPay;

public enum NoteType implements IPay {

    FIVE(5.00),
    TEN(10.00),
    TWENTY(20.00),
    FIFTY(50.00);

    private final Double value;

    NoteType(Double value){
        this.value = value;
    }

    public Double getValue(){
        return this.value;
    }

}
