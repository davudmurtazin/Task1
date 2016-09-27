package exercise13;

/**
 * Created by Davud_Murtazin on 9/27/2016.
 */
public class ProgrammerBook {
    private String language;
    private int level;

    public String getLanguage() {
        return language;
    }

    public int getLevel() {
        return level;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj)
            return true;
        if (!(obj instanceof ProgrammerBook))
            return false;
        ProgrammerBook book = (ProgrammerBook)obj;
        if(language == book.getLanguage()){
            return true;
        }
        if(level == book.getLevel()){
            return true;
        }
        return false;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + level;
        return result;
    }

    @Override
    public String toString() {
        return "Language = " + language + ", Level = " + level;
    }
}
