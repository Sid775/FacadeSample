/**
 * Created by Sid775 on 31.03.2017.
 */
public class Knight {
    String name;
    private Weapon weapon;

    public void setWeapon(Weapon weapon){
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "Knight " + name  +
                " with " + weapon.type  +
                " ready to feat";
    }
}
