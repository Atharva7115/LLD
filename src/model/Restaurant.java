package model;
import java.util.ArrayList ;
import java.util.Collections;
import java.util.List ;


public class Restaurant {
    private String id;
    private String name;
    private String location;
    private List<MenuItem> menuItems;
    public Restaurant(String id, String name, String location) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.menuItems = new ArrayList<>();
    }
    public void addMenuItem(MenuItem item) {
        menuItems.add(item);
    }
    public List<MenuItem> getMenuItems() {
        return Collections.unmodifiableList(menuItems);
    }
    public MenuItem findMenuItem(String itemId) {
        for( MenuItem item : menuItems) {
            if(item.getId().equals(itemId)) {
                return item ;
            }
        }
        return null ;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    @Override
    public String toString() {
        return name + " - " + location;
    }

}
