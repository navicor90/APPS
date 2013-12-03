/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controlador.Interface;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;  
import java.util.List;  
import javax.faces.bean.ManagedProperty;
/**
 *
 * @author milton
 */
@ManagedBean
@RequestScoped
public class OrderListBean {  
    @ManagedProperty(value="#{myController.myModel.list}")
    private List<Player> players;  
      
    private List<String> cities;  
  
    public OrderListBean() {  
          
        //Players  
        players = new ArrayList<>();  
        players.add(new Player("Messi", 10, "messi.jpg")); 
        players.add(new Player("Iniesta", 8, "iniesta.jpg"));  
        players.add(new Player("Villa", 7, "villa.jpg"));  
        players.add(new Player("Xavi", 6, "xavi.jpg"));  
          
        //Cities  423190
        cities = new ArrayList<>();  
          
        cities.add("Istanbul");  
        cities.add("Ankara");  
        cities.add("Izmir");  
        cities.add("Antalya");  
        cities.add("Bursa");  
    }  
  
    public List<String> getCities() {  
        return cities;  
    }  
    public void setCities(List<String> cities) {  
        this.cities = cities;  
    }  
  
    public List<Player> getPlayers() {  
        return players;  
    }  
    public void setPlayers(List<Player> players) {  
        this.players = players;  
    }  
}  