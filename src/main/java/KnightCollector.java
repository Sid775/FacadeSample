/**
 * Created by Sid775 on 31.03.2017.
 */
public class KnightCollector {
    public Knight collectKnight(String name, String weaponType){
        Knight knight = new Knight();
        knight.name = name;
        SmithWeapon smithWeapon = new SmithWeapon();
        knight.setWeapon(smithWeapon.smith(weaponType));
        return knight;
    }
}
