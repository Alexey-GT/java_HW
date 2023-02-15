package oop_homework_1;

public class Relationships {


    public void makeParent(Person parent, Person child){
        parent.isParent(child);
        child.isChild(parent);
        if (parent.getHusband() != null) {
            parent.getHusband().isParent(child);
            child.isChild(parent.getHusband());
        }
    }

    public void marriage(Person husband1, Person husband2){
        if (husband1.getSex().equalsIgnoreCase(husband2.getSex())) {

        } else {
            husband1.isHusband(husband2);
            husband2.isHusband(husband1);

        }
    }

}