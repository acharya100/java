public class Master {
    public static void main(String[] args) {
        
        Friend friend1 = new Friend("sam");
        Friend friend2 = new Friend("ham");
        Friend friend3 = new Friend("kam");
        Friend friend4 = new Friend("jam");

        Friend.showFriends();
        System.out.println("name of those friends are "+friend1.name +","+friend2.name+","+friend3.name+" and "+friend4.name);

        Math.round(3.4);
    }
}
