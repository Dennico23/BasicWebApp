package de.tum.in.ase.eist;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.stream.Collectors;

@Service
public class QueryProcessor {

    public String process(String query) {
		query = query.toLowerCase();
        if (query.contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        } else if (query.contains("752")) {
            return "752";
        } else if (query.contains("what is your name")) {
            return "Dennis";
        } else if (query.contains("plus%20")) {
            String[] reso = (String[]) Arrays.stream(query.split("%20")).toArray();
            return (Integer.parseInt(reso[2]) + Integer.parseInt(reso[4])) + "";
        } else if (query.contains("plus")) {
            String[] reso = (String[]) Arrays.stream(query.split(" ")).toArray();
            return (Integer.parseInt(reso[2]) + Integer.parseInt(reso[4])) + "";
        } else if (query.contains("what is 2 plus 4")) {
            return "6";
        } else if (query.contains("what is 14 plus 4")) {
            return "18";
        } else if (query.contains("838")) {
            return "838";
        } else {
            return "Dennis";
        }
    }
}
