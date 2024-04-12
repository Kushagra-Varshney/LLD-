class Singleton {
    public:
        static Singleton& getInstance() {
            static Singleton instance; //guaranteed to be destroyed and instantiated on completion of utility
            return instance;
        }
    private:
        Singleton() {
        }
        Singleton(Singleton const&) = delete; //cannot use copy constructor
        Singleton& operator=(Singleton const&) = delete; //cannot equate object
}

int main() {
    Singleton& instance1 = Singleton::getInstance();
    Singleton& instance2 = Singleton::getInstance();
}
