public class test {
    public static void main (String[] args){

        Network network = new Network();

        User Rayhan = network.addUser("Rayhan");
        User Akbar = network.addUser("Akbar");

        Rayhan.addPost("Hello, this is Rayhan's first post!");
        Akbar.addPost("Hi everyone, Akbar here!");

        network.addPost(Rayhan.getPosts().get(0));
        network.addPost(Akbar.getPosts().get(0));

        Akbar.likePost(Rayhan.getPosts().get(0));
        Rayhan.likePost(Akbar.getPosts().get(0));

        network.showAllPosts();
    }
} 
