package by.kolbun.andersen.restServices;

import by.kolbun.andersen.ExampleUtils;
import by.kolbun.andersen.entity.Note;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.List;

@Path("/notes")
public class NoteService {

    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Note> getAllNotes() {
        System.out.println("Notes List:"); // dbg
        for (Note n : ExampleUtils.notesList) // ---
            System.out.println(n); //dbg
        return ExampleUtils.notesList;
    }

    @GET
    @Path("/get/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Note getNoteByTitle(@PathParam("id") int id) {
        Note result = ExampleUtils.getNoteById(id);
        System.out.println("Note with id " + id + ":\n" + result); // dbg
        return result;
    }


    /*@GET
    @Path("/{message}")
    public Response getMsg(@PathParam("message") String message) {
        String outStr = "Jersey say : " + message;

        return Response.status(200).entity(outStr).build();
    }*/
}
