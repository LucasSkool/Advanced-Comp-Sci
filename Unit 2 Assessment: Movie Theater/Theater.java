public class Theater {
    private String theaterName;
    private TheaterMember[] registeredMembers;

    public Theater(String theaterName, TheaterMember[] registeredMembers) {
        this.theaterName = theaterName;
        this.registeredMembers = registeredMembers;
    }

    public Theater(String theaterName, int initialCapacity) {
        this.theaterName = theaterName;
        this.registeredMembers = new TheaterMember[initialCapacity];
    }

    public String getTheaterName() {
        return this.theaterName;
    }

    public TheaterMember[] getRegisteredMembers() {
        return this.registeredMembers;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public void setRegisteredMembers(TheaterMember[] registeredMembers) {
        this.registeredMembers = registeredMembers;
    }

    public boolean isFull() {
        boolean result = true;
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] == null) {
                result = false;
            }
        }
        return result;
    }

    public void increaseCapacity() {
        TheaterMember[] newArr = new TheaterMember[registeredMembers.length * 2];
        for (int i = 0; i < registeredMembers.length; i++) {
            newArr[i] = registeredMembers[i];
        }
        this.registeredMembers = newArr;
    }

    public void registerMember(TheaterMember member) {

        if (this.isFull()) {
            this.increaseCapacity();
        }

        boolean done = false;
        for (int i = 0; i < registeredMembers.length && !done; i++) {
            if (registeredMembers[i] == null) {
                registeredMembers[i] = member;
                done = true;
            }
        }

    }

    public String toString() {
        String result = "== " + theaterName + " ==\n";
        int count = 1;
        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i] != null) {
                result += count + ".) " + registeredMembers[i].toString() + "\n";
                count++;
            }
        }
        return result;
    }

    public boolean deleteMember(TheaterMember member) {
        boolean deleted = false;

        for (int i = 0; i < registeredMembers.length; i++) {
            if (registeredMembers[i].equals(member)) {
                registeredMembers[i] = null;
                deleted = true;
            }
        }

        return deleted;
    }
}