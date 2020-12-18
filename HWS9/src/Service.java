public class Service {

    public Service() {}

    private static Service service = new Service();

    public static Service getInstance() {
        return service ;
    }
    public void save (Entity entity) throws Exception {
        try(Repository repository = new Repository()) {
            repository.insert(entity);
        }

    }
    public void delete (Entity entity) throws Exception {
        try(Repository repository = new Repository()) {
            repository.delete(entity);

        }

    }
    public void update (Entity entity) throws Exception {
        try(Repository repository = new Repository()) {
            repository.update(entity);
        }
    }
}
