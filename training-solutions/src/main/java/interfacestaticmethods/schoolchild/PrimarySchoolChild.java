package interfacestaticmethods.schoolchild;

public interface PrimarySchoolChild {

    static PrimarySchoolChild of(int age) {
        if (age < 6 || age > 14) {
            throw new IllegalArgumentException("It's not a schoolchild with this age!");
        } else
            if (age < 11) {
                return new LowerClassSchoolChild(age);
            } else {
                return new UpperClassSchoolChild(age);
            }
    }
}
