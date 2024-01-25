import java.util.List;

import javax.sound.sampled.AudioFileFormat.Type;

class Scene {

    public int Id;
    public List <PoligonalModel> Models;
    public List <Flash> Flashes;
    public List <Camera> Cameras;

    public Scene(int id, List<PoligonalModel> Models, List<Flash> Flashes, List <Camera> Cameras){
        this.Models = Models;
        this.Cameras = Cameras;
        this.Flashes = Flashes;
    }

    public Type method1(Type type){
        return type;
    }
    public Type method2(Type type1, Type type2){
        return type1;
    }
}