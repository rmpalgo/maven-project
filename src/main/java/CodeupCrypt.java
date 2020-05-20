public class CodeupCrypt {
    public static String hash;


        // Takes in a String and hashes the password, returns the finished hash.
        public static String hashPassword(String aString) {
            hash = "";
            for (char character : aString.toCharArray()) {
                switch (character){
                    case 'a':
                    case 'A':
                        hash += 4;
                        break;
                    case 'e':
                    case 'E':
                        hash += 3;
                        break;
                    case 'i':
                    case 'I':
                        hash += 1;
                        break;
                    case 'o':
                    case 'O':
                        hash += 0;
                        break;
                    case 'u':
                    case 'U':
                        hash += 9;
                        break;
                    default:
                        hash += character;
                }
            }
            return hash;
        }

        // Returns true/false if the password is equals to the hash
        public static boolean checkPassword(String password, String hash) {
            return hash.equals(hashPassword(password));
        }

    }


