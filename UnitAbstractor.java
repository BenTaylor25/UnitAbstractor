
class UnitAbstractor {
    public static void main(String[] args) {
        Length myLength = new Length();
        
        myLength.setCm(30);
        System.out.println(myLength.getIn());

        myLength.setIn(72);
        System.out.println(myLength.getCm());
    }
}


