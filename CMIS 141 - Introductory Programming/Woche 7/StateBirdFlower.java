/*
 * Course:  	CMIS 141
 * File: 	StateBirdFlower.java
 * Author: 	Andrew H. Rohn
 * Date: 	8 July 2018
 * Purpose: 	This program displays the state bird and flower for each state.
 */

public class StateBirdFlower {

	// Array Storing State Bird & Flower for Each State
	private String stateInfoArray [][] = {

        	{"ALABAMA","Yellowhammer","Camellia"},
        	{"ALASKA","Willow Ptarmigan","Forget-me-not"},
        	{"ARIZONA","Cactus Wren","Saguaro Cactus Blossom"},
        	{"ARKANSAS","Northern Mockingbird","Apple Blossom"},
        	{"CALIFORNIA","California Quail","California Poppy"},
        	{"COLORADO","Lark Bunting","Rocky Mountain Columbine"}, 
        	{"CONNECTICUT","American Robin","Mountain Laurel"},
        	{"DELAWARE","Delaware Blue Hen","Peach Blossom"},
        	{"FLORIDA","Northern Mockingbird","Orange Blossom"},
        	{"GEORGIA","Brown Thrasher","Cherokee Rose"},
        	{"HAWAII","Hawaiian Goose","Hawaiian Hibiscus"},
        	{"IDAHO","Mountain Bluebird","Syringa, Mock Orange"},
        	{"ILLINOIS","Northern Cardinal","Violet"},
        	{"INDIANA","Northern Cardinal","Peony"},
        	{"IOWA","Eastern Goldfinch","Wild Prairie Rose"},
        	{"KANSAS","Western Meadowlark","Sunflower"},
        	{"KENTUCKY","Northern Cardinal","Goldenrod"},
        	{"LOUISIANA","Brown Pelican","Magnolia"},
        	{"MAINE","Black-capped Chickadee","White Pine Cone and Tassel"},
        	{"MARYLAND","Baltimore Oriole","Black-eyed Susan"},
        	{"MASSACHUSETTS","Black-capped Chickadee","Mayflower"},
        	{"MICHIGAN","American Robin","Apple Blossom"},
		{"MINNESOTA","Common Loon","Pink and White Lady's Slipper"}, 
        	{"MISSISSIPPI","Northern Mockingbird","Magnolia"},
        	{"MISSOURI","Eastern Bluebird","Hawthorn"},
        	{"MONTANA","Western Meadowlark","Bitterroot"},
        	{"NEBRASKA","Western Meadowlark","Goldenrod"},
        	{"NEVADA","Mountain Bluebird","Sagebrush"},
        	{"NEW HAMPSHIRE","Purple Finch","Purple Lilac"},
        	{"NEW JERSEY","Eastern Goldfinch","Violet"},
        	{"NEW MEXICO","Roadrunner","Yucca Flower"},
        	{"NEW YORK","Eastern Bluebird","Rose"},
        	{"NORTH CAROLINA","Northern Cardinal","Flowering Dogwood"},
        	{"NORTH DAKOTA","Western Meadowlark","Wild Prairie Rose"},
        	{"OHIO","Northern Cardinal","Scarlet Carnation"},
        	{"OKLAHOMA","Scissor-tailed Flycatcher","Oklahoma Rose"},
        	{"OREGON","Western Meadowlark","Oregon Grape"},
		{"PENNSYLVANIA","Ruffed Grouse","Mountain Laurel"},
        	{"RHODE ISLAND","Rhode Island Red","Violet"},
        	{"SOUTH CAROLINA","Carolina Wren","Yellow Jessamine"},
        	{"SOUTH DAKOTA","Ring-necked Pheasant","Pasque Flower"},
        	{"TENNESSEE","Nothern Mockingbird","Iris"},
        	{"TEXAS","Northern Mockingbird","Bluebonnet"},
        	{"UTAH","California Gull","Sego Lily"},
        	{"VERMONT","Hermit Thrush","Red Clover"},
        	{"VIRGINIA","Northern Cardinal","American Dogwood"},
        	{"WASHINGTON","Willow Goldfinch","Coast Rhododendron"},
        	{"WEST VIRGINIA","Northern Cardinal","Rhododendron"},
        	{"WISCONSIN","American Robin","Wood Violet"},
        	{"WYOMING","Western Meadowlark","Indian Paintbrush"},
    	};
   	public StateBirdFlower(){
	}
   	public String[][] getStateInfo() {
       		return stateInfoArray;
   	}
   	public void setState(String[][] stateInfoArray) {
       		this.stateInfoArray = stateInfoArray;
   	}
}