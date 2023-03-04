package ru.netology.JavaHomeWork10.MoviesManager;

public class MoviesManager {
    private int limit;

    public MoviesManager(){
        this.limit = 10;
    }

    public MoviesManager(int limit){
        this.limit = limit;
    }

    private String[] movies = new String[0];

    public void addMovie(String movie){
        String[] tmp = new String[movies.length + 1];
        for (int i = 0; i < movies.length; i++) {
            tmp[i] = movies[i];
        }
        tmp[tmp.length - 1] = movie;
        movies = tmp;
    }

    public String[] findAll() {
        return movies;
    }

    public String[] findLast() {
        int resultLenght;
        if (movies.length < limit){
            resultLenght = movies.length;
        } else {
            resultLenght = limit;
        }
        String[] tmp = new String[resultLenght];
        for (int i =0; i < tmp.length; i++){
            tmp[i] = movies[movies.length - 1 - i];
        }
        return tmp;
   }
}
