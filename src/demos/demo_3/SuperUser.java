package demos.demo_3;

public class SuperUser extends User{
    private String skill;

    public SuperUser() {
    }

    public SuperUser(int id, String name, String skill) {
        super(id, name);
        this.skill = skill;
    }

    public void hugging() {
//        System.out.println("Don't hug me!");
        super.hugging();
    }

    public void touching() {}

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public String toString() {
        return "SuperUser(" + "id=" +  super.getId() + ", name=" + super.getName() + ", skill='" + skill + "'" + ") " ;
    }
}
