package Factory;

public class ScalaDeveloperFactory implements DeveloperFactory{

    @Override
    public Developer createDeveloper() {
        return new ScalaDev();
    }
}
