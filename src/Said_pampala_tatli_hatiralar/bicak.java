package Said_pampala_tatli_hatiralar;

public class bicak {

        //folding knives
        public static void main(String[] args) {
            knife f1 = new knife();
            f1.setType("Camping knife");
            f1.setCategory("Folding Knife");
            f1.setLength(7.4);
            System.out.println(f1.getType());
            System.out.println(f1.getCategory());
            System.out.println(f1.getLength());

            knife f2 = new knife();
           f2.setType("Kitchen Knife");

        }
    }
    class knife{
        private String type, category;
        private double length;


        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String getCategory() {
            return category;
        }

        public void setCategory(String category) {
            this.category = category;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        knife(){}
/*
        public knife(String type, String category, double length){
            System.out.println("bura constructor");
            this.type=type;
            this.category=category;
            this.length=length;
        }
        public String toString(){return(getType()+getCategory()+getLength());}
*/
    }

