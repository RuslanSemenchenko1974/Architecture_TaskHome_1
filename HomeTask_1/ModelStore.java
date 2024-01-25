import java.util.ArrayList;
import java.util.List;

public class ModelStore implements IModelChanger{
    public List <PoligonalModel> Models;
    public List<Scene> Scenes;
    public List<Flash> Flashes;
    public List<Camera> Cameras;
    private List <IModelChangedObserver> changedObservers;
    public ModelStore(List <IModelChangedObserver> changedObservers){
        this.changedObservers = changedObservers;
        this.Models = new ArrayList<>();
        this.Scenes = new ArrayList<>();
        this.Flashes = new ArrayList<>();

        Models.add(new PoligonalModel(null));
        Flashes.add(new Flash());
        Cameras.add(new Camera());
        Scenes.add(new Scene(0, Models, Flashes, Cameras));
    }
    public void NotifyChange(IModelChanger sender){

    }
    public Scene GetScena(int id){
        return null;
    }
    
}