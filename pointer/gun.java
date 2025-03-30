public abstract class Gun {
    protected int ammo;
    protected int maxAmmo;
    protected String gunType;

    // Constructor to initialize the gun with max ammo capacity and type
    public Gun(String gunType, int maxAmmo) {
        this.gunType = gunType;
        this.maxAmmo = maxAmmo;
        this.ammo = maxAmmo;  // Gun starts with full ammo
    }

    // Abstract method to shoot
    public abstract void shoot();

    // Method to reload the gun
    public void reload() {
        ammo = maxAmmo;
        System.out.println(gunType + " reloaded. Ammo refilled to " + maxAmmo);
    }

    // Method to get current ammo count
    public int getAmmo() {
        return ammo;
    }

    // Getter for gun type
    public String getGunType() {
        return gunType;
    }
}

// Pistol class - extends Gun
class Pistol extends Gun {

    public Pistol(int maxAmmo) {
        super("Pistol", maxAmmo);
    }

    // Shooting a single round for Pistol
    @Override
    public void shoot() {
        if (ammo > 0) {
            ammo--;
            System.out.println("Pistol shot fired! Ammo left: " + ammo);
        } else {
            System.out.println("Out of ammo in the Pistol! Please reload.");
        }
    }
}

// Shotgun class - extends Gun
class Shotgun extends Gun {

    public Shotgun(int maxAmmo) {
        super("Shotgun", maxAmmo);
    }

    // Shooting a burst for Shotgun (e.g., 3 shots at once)
    @Override
    public void shoot() {
        if (ammo >= 3) {
            ammo -= 3;
            System.out.println("Shotgun fired! 3 rounds used. Ammo left: " + ammo);
        } else if (ammo > 0) {
            System.out.println("Not enough ammo for a full burst. Ammo left: " + ammo);
            ammo = 0;
        } else {
            System.out.println("Out of ammo in the Shotgun! Please reload.");
        }
    }
}

// Automatic Gun class - extends Gun
class AutomaticGun extends Gun {

    public AutomaticGun(int maxAmmo) {
        super("Automatic Gun", maxAmmo);
    }

    // Shooting continuously for Automatic Gun (e.g., 1 shot per second)
