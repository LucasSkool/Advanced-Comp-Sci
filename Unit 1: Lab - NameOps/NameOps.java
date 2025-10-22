public class NameOps {
    
    public static String printMethodCall(String method, String name) {
        return "" + method + "(\"" + name + "\"): ";
    }

    public static String whoIsAwesome(String name) {
        return "" + name + " is awesome!";
    }

    public static int indexOfFirstSpace(String name) {
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ') {
                return i;
            }
        }

        return -1;
    }

    public static int indexOfSecondSpace(String name) {
        boolean pastFirstSpace = false;
        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == ' ' && !pastFirstSpace) {
                pastFirstSpace = true;
            } else if (name.charAt(i) == ' ' && pastFirstSpace) {
                return i;
            }
        }

        return -1;
    }

    public static String findFirstName(String name) {
        if (NameOps.indexOfFirstSpace(name) > -1) {
            return name.substring(0, NameOps.indexOfFirstSpace(name));
        } else {
            return name;
        }
    }

    public static String findLastName(String name) {
        int indexOfLastSpace = -1;
        for (int i = name.length() - 1; i >= 0; i--) {
            if (name.charAt(i) == ' ') {
                indexOfLastSpace = i;
                i = -2;
            }
        }
        if (indexOfLastSpace == -1) {
            return "";
        }
        return name.substring(indexOfLastSpace + 1);
    }

    public static String findMiddleName(String name) {
        if (NameOps.indexOfSecondSpace(name) == -1 || NameOps.indexOfFirstSpace(name) == -1) {
            return "";
        }
        
        return name.substring(NameOps.indexOfFirstSpace(name)
            + 1, NameOps.indexOfSecondSpace(name));
    }

    public static String generateLastFirstMidInitial(String name) {
        if (NameOps.indexOfSecondSpace(name) == -1 && NameOps.indexOfFirstSpace(name) == -1) {
            return name;
        } else if (NameOps.indexOfSecondSpace(name) == -1
            && NameOps.indexOfFirstSpace(name) != -1) {
            return NameOps.findLastName(name) + ", " + NameOps.findFirstName(name);
        } else {
            return NameOps.findLastName(name) + ", "
                + NameOps.findFirstName(name) + " "
                + NameOps.findMiddleName(name).charAt(0) + ".";
        }
    }

}