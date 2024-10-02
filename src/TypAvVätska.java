public enum TypAvVätska {
    KRANVATTEN("kranvatten"),
    MINERALVATTEN("mineralvatten"),
    PROTEINDRYCK("proteindryck");
    private final String typ;

    TypAvVätska(String typ){
        this.typ = typ;
    }

    public String getTypAvVätska(){
        return typ;
    }
}