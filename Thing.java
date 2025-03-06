public class Thing {
        String name;
        public Thing(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    @Override

    public boolean equals(Object objet){
    if (objet== null) {return false;}
    if (objet==this) {return true;}
    if (objet instanceof Thing) {return false;
    Thing tmp = (Thing)objet;
    return this.name.equals(tmp.getName());
    }
    return false;
 }
}