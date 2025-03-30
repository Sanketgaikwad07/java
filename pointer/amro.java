public class Gun {
    private int ammo;
    private int maxAmmo;

    // Constructor to initialize the gun with max ammo capacity
    public Gun(int maxAmmo) {
        this.maxAmmo = maxAmmo;
        this.ammo = maxAmmo;  // Gun starts with full ammo
    }

    // Method to shoot the gun
    public void shoot() {
        if (ammo > 0) {
            ammo--;
            System.out.println("Bang! Ammo left: " + ammo);
        } else {
            System.out.println("Out of ammo! Reload to continue.");
        }
    }

    // Method to reload the gun
    public void reload() {
        ammo = maxAmmo;
        System.out.println("Reloading... Ammo refilled to " + maxAmmo);
    }

    // Method to get current ammo count
    public int getAmmo() {
        return ammo;
    }

    public static void main(String[] args) {
        // Create a gun with a max ammo of 5
        Gun myGun = new Gun(5);

        // Shooting the gun a few times
        myGun.shoot();
        myGun.shoot();
        myGun.shoot();
        myGun.shoot();
        myGun.shoot();
        myGun.shoot();  // This will show "Out of ammo" message

        // Reload the gun
        myGun.reload();

        // Shoot again after reloading
        myGun.shoot();
    }
}
