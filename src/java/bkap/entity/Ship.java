package bkap.entity;

/**
 *
 * @author hien1_000
 */
public class Ship {
    
    private String shipId;
    private float distance;
    private float priceOder;
    private float priceOfShip;

    public Ship() {
    }

    public Ship(String shipId, float distance, float priceOder, float priceOfShip) {
        this.shipId = shipId;
        this.distance = distance;
        this.priceOder = priceOder;
        this.priceOfShip = priceOfShip;
    }

    public String getShipId() {
        return shipId;
    }

    public void setShipId(String shipId) {
        this.shipId = shipId;
    }

    public float getDistance() {
        return distance;
    }

    public void setDistance(float distance) {
        this.distance = distance;
    }

    public float getPriceOder() {
        return priceOder;
    }

    public void setPriceOder(float priceOder) {
        this.priceOder = priceOder;
    }

    public float getPriceOfShip() {
        return priceOfShip;
    }

    public void setPriceOfShip(float priceOfShip) {
        this.priceOfShip = priceOfShip;
    }
    
    
}
