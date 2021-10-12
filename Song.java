/* Danielle Fiesta
Section 11
Assignment 2: Get You A Cat */

/* This program is written to reproduce the "Get you a cat" song. Each method containing "chorus" is meant to print the what each individual animal says in addition to what the animal in the verse preceding it says, and each "verse" is meant to have the introductory lines (Bought me a [blank]...) for each animal in each chorus to create the six verses of the song. */

public class Song {
        public static void Cat_Chorus() {
            System.out.println("Cat goes fiddle-i-fee.");
            System.out.println();
        }

        public static void Hen_Chorus() {
            System.out.println("Hen goes chimmy-chuck, chimmy-chuck,");
            Cat_Chorus();
        }

        public static void Duck_Chorus() {
            System.out.println("Duck goes quack, quack,");
            Hen_Chorus();
        }

        public static void Goose_Chorus() {
            System.out.println("Goose goes hissy, hissy,");
            Duck_Chorus();
        }

        public static void Sheep_Chorus() {
            System.out.println("Sheep goes baa, baa,");
            Goose_Chorus();
        }

        public static void Pig_Chorus() {
            System.out.println("Pig goes oink, oink,");
            Sheep_Chorus();
        }
        
        public static void Opening_Lines(String animal) {
            System.out.println("Bought me a " + animal + " and the " + animal + " pleased me,\nI fed my " + animal + " under yonder tree.");
        }
        
        public static void Cat_Verse() {
            //System.out.println("Bought me a cat and the cat pleased me,\nI fed my cat under yonder tree.");
            Opening_Lines("cat");
            Cat_Chorus();
        }
        
        public static void Hen_Verse() {
            //System.out.println("Bought me a hen and the hen pleased me,\nI fed my hen under yonder tree.");
            Opening_Lines("hen");
            Hen_Chorus();
        }
        
        public static void Duck_Verse() {
            //System.out.println("Bought me a duck and the duck pleased me,\nI fed my duck under yonder tree.");
            Opening_Lines("duck");
            Duck_Chorus();
        }
        
        public static void Goose_Verse() {
            //System.out.println("Bought me a goose and the goose pleased me,\nI fed my goose under yonder tree.");
            Opening_Lines("goose");
            Goose_Chorus();
        }
        
        public static void Sheep_Verse() {
            //System.out.println("Bought me a sheep and the sheep pleased me,\nI fed my sheep under yonder tree.");
            Opening_Lines("sheep");
            Sheep_Chorus();
        }
        
        public static void Pig_Verse() {
            //System.out.println("Bought me a pig and the pig pleased me,\nI fed my pig under yonder tree.");
            Opening_Lines("pig");
            Pig_Chorus();
        }
        
        public static void main (String[] args) {
            Cat_Verse();
            Hen_Verse();
            Duck_Verse();
            Goose_Verse();
            Sheep_Verse();
            Pig_Verse();
        }
}

// Catryoshka