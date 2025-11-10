public class Pool {
    private String name;
    private String ownerName;
    private String username;
    private int cleanlinessLevel;
    private boolean needsChemicalCheck;
    
    public Pool(String name, String ownerName, int cleanlinessLevel) {
        this.name = name;
        this.ownerName = PoolUtils.fixName(ownerName);
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
        this.username = PoolUtils.generateUsername(name); // need a parameter
        this.needsChemicalCheck = false;
    }

    public Pool() {
        this.name = "Unnamed";
        this.ownerName = "Mr Nobody";
        this.cleanlinessLevel = 5;
        this.username = PoolUtils.generateUsername(name); // need a parameter
        this.needsChemicalCheck = false;
    }
    
    public String getName() {
        return name;
    }
    
    public String getOwnerName() {
        return ownerName;
    }
    
    public String getUsername() {
        return username;
    }
    
    public int getCleanlinessLevel() {
        return cleanlinessLevel;
    }

    public boolean isNeedsChemicalCheck() {
        return needsChemicalCheck;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public void setOwnerName(String ownerName) {
        this.ownerName = PoolUtils.fixName(ownerName);
    }
    
    public void setUsername(String username) {
        this.username = username;
    }
    
    public void setCleanlinessLevel(int cleanlinessLevel) {
        this.cleanlinessLevel = PoolUtils.validateCleanlinessLevel(cleanlinessLevel);
    }
    
    public void setNeedsChemicalCheck(boolean needsChemicalCheck) {
        this.needsChemicalCheck = needsChemicalCheck;
    }

    public String toString() {
        String result = "";
        result += "== ABOUT POOL ==\n";
        result += "Name: " + name + "\n";
        result += "Owner: " + ownerName + "\n";
        result += "Username: " + username + "\n";
        result += "Cleanliness Level: " + cleanlinessLevel + "\n";
        if (needsChemicalCheck == true) {
            result += "Does pool need chemical check? Yes";
        } else {
            result += "Does pool need chemical check? No";
        }
        return result;
    }

    public boolean equals(Pool other) {
        this.username = other.getUsername(); // IDK if this is what it is asking for? ??? ?
        if (this.name.equals(other.getName())
            && this.ownerName.equals(other.getOwnerName())
            && this.username.equals(other.getUsername())
            && this.cleanlinessLevel == other.getCleanlinessLevel()
            && this.needsChemicalCheck == other.isNeedsChemicalCheck()) {
            return true;
        }

        return false;
    }
    
}
