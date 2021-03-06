import java.util.List;

public class Main {
    private static AllVehicles vp = new AllVehicles();
    private static AllRoutes ar = new AllRoutes();
    private static AllStops as = new AllStops();
    private static AllEmployees ae = new AllEmployees();
    private static AllPlaces ap = new AllPlaces();

    private static Depot d1 = new Depot("Bucium", 0);
    private static Depot d2 = new Depot("Unirii", 1);
    private static Depot d3 = new Depot("Zorilor", 2);

    public static void main(String[] args) {
        {
            as.addStop(new Stop("Taberei"));
            as.addStop(new Stop("Calea Floresti"));
            as.addStop(new Stop("Nodul N"));
            as.addStop(new Stop("VIVO"));
            as.addStop(new Stop("Ciobanului"));
            as.addStop(new Stop("P-ta Flora"));
            as.addStop(new Stop("Calea Manastur"));
            as.addStop(new Stop("Agronomia"));
            as.addStop(new Stop("Calea Motilor"));
            as.addStop(new Stop("Memorandumului Sud"));
            as.addStop(new Stop("Victoria"));
            as.addStop(new Stop("Regionala CFR"));
            as.addStop(new Stop("Biserica Sf. Petru"));
            as.addStop(new Stop("P-ta Marasti"));
            as.addStop(new Stop("Maresal C-tin Prezan"));
            as.addStop(new Stop("Dorobantilor"));
            as.addStop(new Stop("Campus Universitar Vest"));
            as.addStop(new Stop("Iulius Mall Vest"));
            as.addStop(new Stop("Valeriu Bologa"));
            as.addStop(new Stop("Colegiul Pedagogic"));
            as.addStop(new Stop("Iulius Mall Est"));
            as.addStop(new Stop("Campus Universitar Est"));
            as.addStop(new Stop("Arte Plastice"));
            as.addStop(new Stop("Crinului"));
            as.addStop(new Stop("Somes"));
            as.addStop(new Stop("Constanta"));
            as.addStop(new Stop("Sora"));
            as.addStop(new Stop("Memorandumului Nord"));
            as.addStop(new Stop("Spitalul de Copii"));
            as.addStop(new Stop("Fabrica de Bere"));
            as.addStop(new Stop("Gradini Manastur"));

            as.addStop(new Stop("Central"));
            as.addStop(new Stop("Closca"));
            as.addStop(new Stop("P-ta Garii"));
            as.addStop(new Stop("Traian"));
            as.addStop(new Stop("P-ta Mihai Viteazul"));

            as.addStop(new Stop("Biblioteca Judeteana"));
            as.addStop(new Stop("Sc. S. Barnutiu"));
            as.addStop(new Stop("Tribunal"));
            as.addStop(new Stop("P-ta Avram Iancu"));

            as.addStop(new Stop("P-ta Cipariu"));
            as.addStop(new Stop("Gheorghe Doja"));
            as.addStop(new Stop("Calea Turzii"));
            as.addStop(new Stop("W.A. Mozart"));
            as.addStop(new Stop("Electrogroup"));
            as.addStop(new Stop("Compexit"));
            as.addStop(new Stop("Dacia Service"));
            as.addStop(new Stop("Drum Faget"));
            as.addStop(new Stop("Centrul Medical"));
            as.addStop(new Stop("Constantin Noica"));
            as.addStop(new Stop("Meteor"));
            as.addStop(new Stop("Silviu Dragomir"));
            as.addStop(new Stop("Teatru"));

            as.addStop(new Stop("Observatorului Nord"));
            as.addStop(new Stop("Spitalul Recuperare Nord"));
            as.addStop(new Stop("Ghe. Dima"));
            as.addStop(new Stop("Frunzisului"));
            as.addStop(new Stop("Cocosul de Aur"));
            as.addStop(new Stop("Gr. Alexandrescu"));
            as.addStop(new Stop("Peana"));
            as.addStop(new Stop("Ravasului"));
            as.addStop(new Stop("Garbau"));
            as.addStop(new Stop("Clabucet"));
            as.addStop(new Stop("Bucium"));
            as.addStop(new Stop("Colina"));
            as.addStop(new Stop("Primaverii"));
            as.addStop(new Stop("Minerva"));
            as.addStop(new Stop("Izlazului"));
            as.addStop(new Stop("Frunzisului Vest"));
            as.addStop(new Stop("Varianta Zorilor"));
            as.addStop(new Stop("Zorilor"));
            as.addStop(new Stop("Spitalul Recuperare Sud"));
            as.addStop(new Stop("Observatorului Sud"));

            as.addStop(new Stop("Ploiesti"));
            as.addStop(new Stop("Paris"));
            as.addStop(new Stop("P-ta 1 Mai"));
            as.addStop(new Stop("Barbu Patriciu"));
        }
        {
            ae.addEmployee(new Employee("Ciobanu Vasile"));
            ae.addEmployee(new Employee("Pop Ioana"));
            ae.addEmployee(new Employee("Dobre Teodor"));
            ae.addEmployee(new Employee("Stanescu Calin"));
            ae.addEmployee(new Employee("Tabac Daniel"));
            ae.addEmployee(new Employee("Petrescu Miruna"));
            ae.addEmployee(new Employee("Moisescu Ionut"));
            ae.addEmployee(new Employee("Ursu Stefania"));
            ae.addEmployee(new Employee("Tabac Maria"));
            ae.addEmployee(new Employee("Puscasu Dan"));
            ae.addEmployee(new Employee("Mihailescu Patricia"));
            ae.addEmployee(new Employee("Rusu Ovidiu"));
            ae.addEmployee(new Employee("Ciobanu Stefana"));
            ae.addEmployee(new Employee("Constantinescu Ana"));
            ae.addEmployee(new Employee("Dobre Alexandra"));
            ae.addEmployee(new Employee("Diaconu Gheorghe"));
            ae.addEmployee(new Employee("Dobre Marian"));
            ae.addEmployee(new Employee("Lupu Daniel"));
            ae.addEmployee(new Employee("Constantinescu Paul"));
            ae.addEmployee(new Employee("Tabac Luca"));
            ae.addEmployee(new Employee("Sava Radu"));
            ae.addEmployee(new Employee("Tomescu Catalin"));
            ae.addEmployee(new Employee("Diaconu Ramona"));
            ae.addEmployee(new Employee("Fratila Iulian"));
            ae.addEmployee(new Employee("Diaconu Luca"));
            ae.addEmployee(new Employee("Munteanu Alexandru"));
            ae.addEmployee(new Employee("Mihailescu Stefan"));
            ae.addEmployee(new Employee("Dinescu Dan"));
            ae.addEmployee(new Employee("Toma Gabriela"));
            ae.addEmployee(new Employee("Stanescu Andrei"));
            ae.addEmployee(new Employee("Mocanu Ovidiu"));
            ae.addEmployee(new Employee("Cristea Gabriela"));
            ae.addEmployee(new Employee("Ciobanu Cristian"));
            ae.addEmployee(new Employee("Manole Andrei"));
            ae.addEmployee(new Employee("Puscasu Victor"));
            ae.addEmployee(new Employee("Stanescu Radu"));
            ae.addEmployee(new Employee("Nitu Ionut"));
            ae.addEmployee(new Employee("Sava Teodor"));
            ae.addEmployee(new Employee("Dinescu Catalin"));
            ae.addEmployee(new Employee("Gheorghiu Daniel"));
            ae.addEmployee(new Employee("Sava Costin"));
            ae.addEmployee(new Employee("Iancu Gheorghe"));
            ae.addEmployee(new Employee("Dinu Ovidiu"));
            ae.addEmployee(new Employee("Stanescu Marian"));
            ae.addEmployee(new Employee("Rusu Maria"));
            ae.addEmployee(new Employee("Calinescu Costin"));
            ae.addEmployee(new Employee("Florea Maria"));
            ae.addEmployee(new Employee("Nistor Daniel"));
            ae.addEmployee(new Employee("Ionita Bogdan"));
            ae.addEmployee(new Employee("Marin Daria"));
            ae.addEmployee(new Employee("Stanciu Bogdan"));
            ae.addEmployee(new Employee("Nistor Calin"));
            ae.addEmployee(new Employee("Petrescu Daria"));
            ae.addEmployee(new Employee("Mocanu Gabriel"));
            ae.addEmployee(new Employee("Sava Stefania"));
            ae.addEmployee(new Employee("Gheorghiu Ion"));
            ae.addEmployee(new Employee("Constantin Radu"));
            ae.addEmployee(new Employee("Constantin Florin"));
            ae.addEmployee(new Employee("Calinescu Ion"));
            ae.addEmployee(new Employee("Teodorescu Romana"));
            ae.addEmployee(new Employee("Munteanu Gabriel"));
            ae.addEmployee(new Employee("Tudor Paul"));
            ae.addEmployee(new Employee("Ionita Calin"));
            ae.addEmployee(new Employee("Pop Mihai"));
            ae.addEmployee(new Employee("Toma Marian"));
            ae.addEmployee(new Employee("Albu Gabriel"));
            ae.addEmployee(new Employee("Dumitrescu Andreea"));
            ae.addEmployee(new Employee("Stanescu Maria"));
            ae.addEmployee(new Employee("Ionescu Ana"));
            ae.addEmployee(new Employee("Albu Ramona"));
            ae.addEmployee(new Employee("Gheorghiu Marius"));
            ae.addEmployee(new Employee("Voinea Calin"));
            ae.addEmployee(new Employee("Puscasu Ionut"));
            ae.addEmployee(new Employee("Ionita Ana"));
            ae.addEmployee(new Employee("Nita Mihai"));
            ae.addEmployee(new Employee("Toma Victor"));
            ae.addEmployee(new Employee("Mehedintu Cristian"));
            ae.addEmployee(new Employee("Mehedintu Cristian"));
            ae.addEmployee(new Employee("Voinea Ionut"));
            ae.addEmployee(new Employee("Stanescu Calin"));
            ae.addEmployee(new Employee("Toma Tudor"));
            ae.addEmployee(new Employee("Nistor Ana"));
            ae.addEmployee(new Employee("Dinescu Costin"));
            ae.addEmployee(new Employee("Ciobanu Catalin"));
            ae.addEmployee(new Employee("Teodorescu Florin"));
            ae.addEmployee(new Employee("Calinescu Paul"));
            ae.addEmployee(new Employee("Rusu Luca"));
            ae.addEmployee(new Employee("Nistor Luca"));
            ae.addEmployee(new Employee("Dumitrescu Florin"));
            ae.addEmployee(new Employee("Toma Stefania"));
            ae.addEmployee(new Employee("Pop Catalin"));
            ae.addEmployee(new Employee("Toma Alexandra"));
            ae.addEmployee(new Employee("Nistor Ion"));
            ae.addEmployee(new Employee("Voinea Ovidiu"));
            ae.addEmployee(new Employee("Florea Ioana"));
            ae.addEmployee(new Employee("Ciobanu Ana"));
            ae.addEmployee(new Employee("Constantin Ovidiu"));
            ae.addEmployee(new Employee("Teodorescu Alexandru"));
            ae.addEmployee(new Employee("Munteanu Ramona"));
            ae.addEmployee(new Employee("Lupu Vasile"));
            ae.addEmployee(new Employee("Munteanu Iulian"));
            ae.addEmployee(new Employee("Petrescu Victor"));
            ae.addEmployee(new Employee("Andreescu Ioana"));
            ae.addEmployee(new Employee("Nita Marian"));
            ae.addEmployee(new Employee("Teodorescu Andreea"));
            ae.addEmployee(new Employee("Dinu Daria"));
            ae.addEmployee(new Employee("Popescu Teodor"));
            ae.addEmployee(new Employee("Petrescu Elena"));
            ae.addEmployee(new Employee("Gheorghiu Romana"));
            ae.addEmployee(new Employee("Nitu Maria"));
            ae.addEmployee(new Employee("Andreescu Victor"));
            ae.addEmployee(new Employee("Georgescu Stefania"));
            ae.addEmployee(new Employee("Rusu Stefan"));
            ae.addEmployee(new Employee("Blaga Stefana"));
            ae.addEmployee(new Employee("Pop Stefana"));
            ae.addEmployee(new Employee("Constantinescu Gabriela"));
            ae.addEmployee(new Employee("Lupu David"));
            ae.addEmployee(new Employee("Mehedintu Ana"));
            ae.addEmployee(new Employee("Constantinescu Florin"));
            ae.addEmployee(new Employee("Marin Ramona"));
            ae.addEmployee(new Employee("Diaconescu Stefan"));
            ae.addEmployee(new Employee("Dobre Costin"));
            ae.addEmployee(new Employee("Diaconescu Cristian"));
            ae.addEmployee(new Employee("Nistor Daniel"));
            ae.addEmployee(new Employee("Sava Ramona"));
            ae.addEmployee(new Employee("Ciobanu Cristian"));
            ae.addEmployee(new Employee("Tabac Ovidiu"));
            ae.addEmployee(new Employee("Dobre Miruna"));
            ae.addEmployee(new Employee("Andreescu Teodor"));
            ae.addEmployee(new Employee("Mocanu Daniel"));
            ae.addEmployee(new Employee("Dima Gheorghe"));
            ae.addEmployee(new Employee("Albu Marian"));
            ae.addEmployee(new Employee("Dinescu Paul"));
            ae.addEmployee(new Employee("Mehedintu Gabriel"));
            ae.addEmployee(new Employee("Popescu Cristian"));
            ae.addEmployee(new Employee("Toma Andrei"));
            ae.addEmployee(new Employee("Ciobanu Andreea"));
            ae.addEmployee(new Employee("Sava Costin"));
            ae.addEmployee(new Employee("Stanciu Alexandru"));
            ae.addEmployee(new Employee("Nistor Daria"));
            ae.addEmployee(new Employee("Teodoru Tudor"));
            ae.addEmployee(new Employee("Dinescu Stefana"));
            ae.addEmployee(new Employee("Munteanu Bogdan"));
            ae.addEmployee(new Employee("Dima Ana"));
            ae.addEmployee(new Employee("Popescu Ovidiu"));
            ae.addEmployee(new Employee("Diaconu Victor"));
            ae.addEmployee(new Employee("Fratila Alexandra"));
            ae.addEmployee(new Employee("Petrescu Mihai"));
            ae.addEmployee(new Employee("Manole Iulian"));
            ae.addEmployee(new Employee("Tudor Paul"));
        }
        {
            Route r1 = new Route(1);

            r1.addStop(as.getStop("Bucium"));
            r1.addStop(as.getStop("Primaverii"));
            r1.addStop(as.getStop("Minerva"));
            r1.addStop(as.getStop("Izlazului"));
            r1.addStop(as.getStop("Calea Manastur"));
            r1.addStop(as.getStop("Agronomia"));
            r1.addStop(as.getStop("Calea Motilor"));
            r1.addStop(as.getStop("Memorandumului Sud"));
            r1.addStop(as.getStop("Victoria"));
            r1.addStop(as.getStop("Regionala CFR"));
            r1.addStop(as.getStop("Ploiesti"));
            r1.addStop(as.getStop("Paris"));
            r1.addStop(as.getStop("P-ta 1 Mai"));
            r1.addStop(as.getStop("Barbu Patriciu"));
            r1.addStop(as.getStop("Constanta"));
            r1.addStop(as.getStop("Memorandumului Nord"));
            r1.addStop(as.getStop("Spitalul de Copii"));
            r1.addStop(as.getStop("Fabrica de Bere"));
            r1.addStop(as.getStop("Gradini Manastur"));
            r1.addStop(as.getStop("Peana"));
            r1.addStop(as.getStop("Garbau"));

            ar.addRoute(r1);


            Route r4 = new Route(4);

            r4.addStop(as.getStop("Arte Plastice"));
            r4.addStop(as.getStop("Crinului"));
            r4.addStop(as.getStop("Somes"));
            r4.addStop(as.getStop("Constanta"));
            r4.addStop(as.getStop("Sora"));
            r4.addStop(as.getStop("Central"));
            r4.addStop(as.getStop("Closca"));
            r4.addStop(as.getStop("P-ta Garii"));
            r4.addStop(as.getStop("Traian"));
            r4.addStop(as.getStop("P-ta Mihai Viteazul"));
            r4.addStop(as.getStop("Regionala CFR"));
            r4.addStop(as.getStop("Biserica Sf. Petru"));
            r4.addStop(as.getStop("P-ta Marasti"));
            r4.addStop(as.getStop("Maresal C-tin Prezan"));

            ar.addRoute(r4);


            Route r6 = new Route(6);

            r6.addStop(as.getStop("Bucium"));
            r6.addStop(as.getStop("Primaverii"));
            r6.addStop(as.getStop("Minerva"));
            r6.addStop(as.getStop("Izlazului"));
            r6.addStop(as.getStop("Calea Manastur"));
            r6.addStop(as.getStop("Agronomia"));
            r6.addStop(as.getStop("Calea Motilor"));
            r6.addStop(as.getStop("Memorandumului Sud"));
            r6.addStop(as.getStop("Victoria"));
            r6.addStop(as.getStop("Regionala CFR"));
            r6.addStop(as.getStop("Biserica Sf. Petru"));
            r6.addStop(as.getStop("P-ta Marasti"));
            r6.addStop(as.getStop("Maresal C-tin Prezan"));
            r6.addStop(as.getStop("Arte Plastice"));
            r6.addStop(as.getStop("Crinului"));
            r6.addStop(as.getStop("Somes"));
            r6.addStop(as.getStop("Constanta"));
            r6.addStop(as.getStop("Sora"));
            r6.addStop(as.getStop("Memorandumului Nord"));
            r6.addStop(as.getStop("Spitalul de Copii"));
            r6.addStop(as.getStop("Fabrica de Bere"));
            r6.addStop(as.getStop("Gradini Manastur"));
            r6.addStop(as.getStop("Peana"));
            r6.addStop(as.getStop("Garbau"));

            ar.addRoute(r6);


            Route r7 = new Route(7);

            r7.addStop(as.getStop("Arte Plastice"));
            r7.addStop(as.getStop("Crinului"));
            r7.addStop(as.getStop("Somes"));
            r7.addStop(as.getStop("Constanta"));
            r7.addStop(as.getStop("Sora"));
            r7.addStop(as.getStop("Memorandumului Nord"));
            r7.addStop(as.getStop("Spitalul de Copii"));
            r7.addStop(as.getStop("Fabrica de Bere"));
            r7.addStop(as.getStop("Gradini Manastur"));
            r7.addStop(as.getStop("Izlazului"));
            r7.addStop(as.getStop("Calea Manastur"));
            r7.addStop(as.getStop("Agronomia"));
            r7.addStop(as.getStop("Calea Motilor"));
            r7.addStop(as.getStop("Memorandumului Sud"));
            r7.addStop(as.getStop("Victoria"));
            r7.addStop(as.getStop("Regionala CFR"));
            r7.addStop(as.getStop("Biserica Sf. Petru"));
            r7.addStop(as.getStop("P-ta Marasti"));
            r7.addStop(as.getStop("Maresal C-tin Prezan"));

            ar.addRoute(r7);


            Route r9 = new Route(9);

            r9.addStop(as.getStop("Bucium"));
            r9.addStop(as.getStop("Calea Manastur"));
            r9.addStop(as.getStop("Agronomia"));
            r9.addStop(as.getStop("Calea Motilor"));
            r9.addStop(as.getStop("Memorandumului Sud"));
            r9.addStop(as.getStop("Central"));
            r9.addStop(as.getStop("Closca"));
            r9.addStop(as.getStop("P-ta Garii"));
            r9.addStop(as.getStop("Traian"));
            r9.addStop(as.getStop("Memorandumului Nord"));
            r9.addStop(as.getStop("Spitalul de Copii"));
            r9.addStop(as.getStop("Fabrica de Bere"));
            r9.addStop(as.getStop("Gradini Manastur"));
            r9.addStop(as.getStop("Taberei"));
            r9.addStop(as.getStop("Calea Floresti"));
            r9.addStop(as.getStop("Colina"));

            ar.addRoute(r9);


            Route r24 = new Route(24);

            r24.addStop(as.getStop("Colegiul Pedagogic"));
            r24.addStop(as.getStop("Iulius Mall Est"));
            r24.addStop(as.getStop("Campus Universitar Est"));
            r24.addStop(as.getStop("Arte Plastice"));
            r24.addStop(as.getStop("Crinului"));
            r24.addStop(as.getStop("Somes"));
            r24.addStop(as.getStop("Constanta"));
            r24.addStop(as.getStop("Sora"));
            r24.addStop(as.getStop("Memorandumului Nord"));
            r24.addStop(as.getStop("Spitalul de Copii"));
            r24.addStop(as.getStop("Fabrica de Bere"));
            r24.addStop(as.getStop("Gradini Manastur"));
            r24.addStop(as.getStop("Taberei"));
            r24.addStop(as.getStop("Calea Floresti"));
            r24.addStop(as.getStop("Nodul N"));
            r24.addStop(as.getStop("VIVO"));
            r24.addStop(as.getStop("Ciobanului"));
            r24.addStop(as.getStop("P-ta Flora"));
            r24.addStop(as.getStop("Calea Manastur"));
            r24.addStop(as.getStop("Agronomia"));
            r24.addStop(as.getStop("Calea Motilor"));
            r24.addStop(as.getStop("Memorandumului Sud"));
            r24.addStop(as.getStop("Victoria"));
            r24.addStop(as.getStop("Regionala CFR"));
            r24.addStop(as.getStop("Biserica Sf. Petru"));
            r24.addStop(as.getStop("P-ta Marasti"));
            r24.addStop(as.getStop("Maresal C-tin Prezan"));
            r24.addStop(as.getStop("Dorobantilor"));
            r24.addStop(as.getStop("Campus Universitar Vest"));
            r24.addStop(as.getStop("Iulius Mall Vest"));
            r24.addStop(as.getStop("Valeriu Bologa"));

            ar.addRoute(r24);


            Route r29 = new Route(29);

            r29.addStop(as.getStop("Bucium"));
            r29.addStop(as.getStop("Ciobanului"));
            r29.addStop(as.getStop("P-ta Flora"));
            r29.addStop(as.getStop("Calea Manastur"));
            r29.addStop(as.getStop("Agronomia"));
            r29.addStop(as.getStop("Calea Motilor"));
            r29.addStop(as.getStop("Memorandumului Sud"));
            r29.addStop(as.getStop("Central"));
            r29.addStop(as.getStop("P-ta Mihai Viteazul"));
            r29.addStop(as.getStop("Traian"));
            r29.addStop(as.getStop("Memorandumului Nord"));
            r29.addStop(as.getStop("Spitalul de Copii"));
            r29.addStop(as.getStop("Fabrica de Bere"));
            r29.addStop(as.getStop("Gradini Manastur"));
            r29.addStop(as.getStop("Taberei"));
            r29.addStop(as.getStop("Calea Floresti"));
            r29.addStop(as.getStop("Colina"));

            ar.addRoute(r29);


            Route r35 = new Route(35);

            r35.addStop(as.getStop("Zorilor"));
            r35.addStop(as.getStop("Spitalul Recuperare Sud"));
            r35.addStop(as.getStop("Observatorului Sud"));
            r35.addStop(as.getStop("Gheorghe Doja"));
            r35.addStop(as.getStop("P-ta Cipariu"));
            r35.addStop(as.getStop("P-ta Avram Iancu"));
            r35.addStop(as.getStop("Sora"));
            r35.addStop(as.getStop("Central"));
            r35.addStop(as.getStop("Closca"));
            r35.addStop(as.getStop("P-ta Garii"));
            r35.addStop(as.getStop("Traian"));
            r35.addStop(as.getStop("P-ta Mihai Viteazul"));
            r35.addStop(as.getStop("Teatru"));
            r35.addStop(as.getStop("Silviu Dragomir"));
            r35.addStop(as.getStop("Observatorului Nord"));
            r35.addStop(as.getStop("Spitalul Recuperare Nord"));
            r35.addStop(as.getStop("Ghe. Dima"));

            ar.addRoute(r35);


            Route r40 = new Route(40);

            r40.addStop(as.getStop("Teatru"));
            r40.addStop(as.getStop("Silviu Dragomir"));
            r40.addStop(as.getStop("Meteor"));
            r40.addStop(as.getStop("Constantin Noica"));
            r40.addStop(as.getStop("Centrul Medical"));
            r40.addStop(as.getStop("Drum Faget"));
            r40.addStop(as.getStop("Dacia Service"));
            r40.addStop(as.getStop("Electrogroup"));
            r40.addStop(as.getStop("W.A. Mozart"));
            r40.addStop(as.getStop("Calea Turzii"));
            r40.addStop(as.getStop("Gheorghe Doja"));
            r40.addStop(as.getStop("P-ta Cipariu"));
            r40.addStop(as.getStop("P-ta Avram Iancu"));

            ar.addRoute(r40);


            Route r430 = new Route(430);

            r430.addStop(as.getStop("Colina"));
            r430.addStop(as.getStop("Primaverii"));
            r430.addStop(as.getStop("Minerva"));
            r430.addStop(as.getStop("Izlazului"));
            r430.addStop(as.getStop("Frunzisului Vest"));
            r430.addStop(as.getStop("Varianta Zorilor"));
            r430.addStop(as.getStop("Zorilor"));
            r430.addStop(as.getStop("Spitalul Recuperare Sud"));
            r430.addStop(as.getStop("Observatorului Sud"));
            r430.addStop(as.getStop("Meteor"));
            r430.addStop(as.getStop("Constantin Noica"));
            r430.addStop(as.getStop("Centrul Medical"));
            r430.addStop(as.getStop("Drum Faget"));
            r430.addStop(as.getStop("Dacia Service"));
            r430.addStop(as.getStop("Compexit"));
            r430.addStop(as.getStop("Electrogroup"));
            r430.addStop(as.getStop("W.A. Mozart"));
            r430.addStop(as.getStop("Observatorului Nord"));
            r430.addStop(as.getStop("Spitalul Recuperare Nord"));
            r430.addStop(as.getStop("Ghe. Dima"));
            r430.addStop(as.getStop("Frunzisului"));
            r430.addStop(as.getStop("Cocosul de Aur"));
            r430.addStop(as.getStop("Peana"));
            r430.addStop(as.getStop("Garbau"));
            r430.addStop(as.getStop("Bucium"));

            ar.addRoute(r430);


            Route r431 = new Route(431);

            r431.addStop(as.getStop("VIVO"));
            r431.addStop(as.getStop("Colina"));
            r431.addStop(as.getStop("Primaverii"));
            r431.addStop(as.getStop("Minerva"));
            r431.addStop(as.getStop("Izlazului"));
            r431.addStop(as.getStop("Frunzisului Vest"));
            r431.addStop(as.getStop("Varianta Zorilor"));
            r431.addStop(as.getStop("Zorilor"));
            r431.addStop(as.getStop("Spitalul Recuperare Sud"));
            r431.addStop(as.getStop("Observatorului Sud"));
            r431.addStop(as.getStop("Observatorului Nord"));
            r431.addStop(as.getStop("Spitalul de Recuperare Nord"));
            r431.addStop(as.getStop("Ghe. Dima"));
            r431.addStop(as.getStop("Frunzisului"));
            r431.addStop(as.getStop("Cocosul de Aur"));
            r431.addStop(as.getStop("Peana"));
            r431.addStop(as.getStop("Garbau"));
            r431.addStop(as.getStop("Bucium"));

            ar.addRoute(r431);


            Route r460 = new Route(460);

            r460.addStop(as.getStop("Zorilor"));
            r460.addStop(as.getStop("Spitalul Recuperare Sud"));
            r460.addStop(as.getStop("Observatorului Sud"));
            r460.addStop(as.getStop("Gheorghe Doja"));
            r460.addStop(as.getStop("P-ta Cipariu"));
            r460.addStop(as.getStop("P-ta Avram Iancu"));
            r460.addStop(as.getStop("Teatru"));
            r460.addStop(as.getStop("Silviu Dragomir"));
            r460.addStop(as.getStop("Observatorului Nord"));
            r460.addStop(as.getStop("Spitalul Recuperare Nord"));
            r460.addStop(as.getStop("Ghe. Dima"));

            ar.addRoute(r460);


            Route r461 = new Route(461);

            r461.addStop(as.getStop("Arte Plastice"));
            r461.addStop(as.getStop("Crinului"));
            r461.addStop(as.getStop("Somes"));
            r461.addStop(as.getStop("Constanta"));
            r461.addStop(as.getStop("Teatru"));
            r461.addStop(as.getStop("Silviu Dragomir"));
            r461.addStop(as.getStop("Observatorului Nord"));
            r461.addStop(as.getStop("Spitalul Recuperare Nord"));
            r461.addStop(as.getStop("Ghe. Dima"));
            r461.addStop(as.getStop("Zorilor"));
            r461.addStop(as.getStop("Spitalul Recuperare Sud"));
            r461.addStop(as.getStop("Observatorului Sud"));
            r461.addStop(as.getStop("Gheorghe Doja"));
            r461.addStop(as.getStop("P-ta Cipariu"));
            r461.addStop(as.getStop("Tribunal"));
            r461.addStop(as.getStop("Sc. S. Barnutiu"));
            r461.addStop(as.getStop("Biblioteca Judeteana"));
            r461.addStop(as.getStop("Maresal C-tin Prezan"));

            ar.addRoute(r461);
        }
        {
            vp.addVehicle(new Vehicle(100, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(101, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(102, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(103, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(104, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(105, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(106, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(107, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(108, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(109, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(110, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(111, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(112, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(113, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(115, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(116, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(117, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(118, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(119, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(120, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(121, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(122, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(123, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(124, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(125, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(126, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(127, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(128, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(131, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(132, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(133, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(134, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(135, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(136, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(137, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(138, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(139, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(140, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(141, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(142, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(143, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(144, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(145, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(146, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(147, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(148, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(149, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(151, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(152, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(153, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(154, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(155, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(156, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(157, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(158, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(159, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(160, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(161, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(162, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(163, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(164, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(166, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(167, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(168, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(169, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(170, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(171, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(172, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(173, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(174, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(176, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(177, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(178, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(179, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(180, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(182, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(183, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(184, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(185, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(186, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(187, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(188, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(189, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(190, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(191, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(192, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(193, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(194, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(195, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(198, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(199, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(200, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(202, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(203, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(204, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(205, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(206, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(207, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(208, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(209, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(210, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(211, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(212, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(213, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(214, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(215, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(216, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(217, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(218, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(219, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(220, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(222, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(224, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(225, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(226, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(227, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(228, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(229, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(230, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(231, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(232, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(233, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(234, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(235, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(236, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(237, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(239, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(240, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(241, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(242, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(243, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(244, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(245, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(246, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(247, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(249, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(250, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(251, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(252, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(253, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(254, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(255, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(256, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(257, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(258, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(259, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(260, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(261, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(262, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(263, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(264, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(265, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(266, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(267, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(268, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(269, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(270, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(271, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(272, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(273, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(274, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(275, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(276, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(277, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(278, Vehicle.vehicleType.BUS));
            vp.addVehicle(new Vehicle(279, Vehicle.vehicleType.BUS));

            vp.addVehicle(new Vehicle(300, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(301, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(302, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(303, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(304, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(305, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(306, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(307, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(308, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(309, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(310, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(311, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(312, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(313, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(314, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(318, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(319, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(320, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(321, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(322, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(323, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(325, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(326, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(327, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(330, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(331, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(332, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(333, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(334, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(335, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(336, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(337, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(338, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(339, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(340, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(341, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(342, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(343, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(344, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(345, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(346, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(347, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(348, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(349, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(351, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(352, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(353, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(354, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(355, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(356, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(357, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(359, Vehicle.vehicleType.TROLLEYBUS));
            vp.addVehicle(new Vehicle(360, Vehicle.vehicleType.TROLLEYBUS));

            vp.addVehicle(new Vehicle(900, Vehicle.vehicleType.SERVICE));
            vp.addVehicle(new Vehicle(901, Vehicle.vehicleType.SERVICE));
            vp.addVehicle(new Vehicle(903, Vehicle.vehicleType.SERVICE));
            vp.addVehicle(new Vehicle(905, Vehicle.vehicleType.SERVICE));
            vp.addVehicle(new Vehicle(906, Vehicle.vehicleType.SERVICE));
            vp.addVehicle(new Vehicle(907, Vehicle.vehicleType.SERVICE));
            vp.addVehicle(new Vehicle(908, Vehicle.vehicleType.SERVICE));
            vp.addVehicle(new Vehicle(909, Vehicle.vehicleType.SERVICE));
        }
        {
            ap.addPlace(d1);
            ap.addPlace(d2);
            ap.addPlace(d3);

            for(int i = 0; i < as.getN(); i++) {
                ap.addPlace(as.getStop(i));
            }
        }

        Vehicle[] v = vp.getPark();

        for(int i = 0; i < 110; i++) {
            d1.addVehicle(v[i]);
        }

        for(int i = 110; i < 150; i++) {
            d2.addVehicle(v[i]);
        }

        for(int i = 150; i < 167; i++) {
            d3.addVehicle(v[i]);
        }

        d1.addVehicle(v[167]);
        d1.addVehicle(v[168]);
        d1.addVehicle(v[169]);
        d1.addVehicle(v[170]);

        d2.addVehicle(v[171]);
        d2.addVehicle(v[172]);

        d3.addVehicle(v[173]);
        d3.addVehicle(v[174]);

        for(int i = 174; i < 205; i++) {
            d1.addVehicle(v[i]);
        }

        for(int i = 205; i < 218; i++) {
            d3.addVehicle(v[i]);
        }

        Stop[] aux = as.getAll();
        for(int i = 0; i < as.getN(); i++) {
            aux[i].setId(i + 3);
        }

        MainFrame mf = new MainFrame(vp, ar, as, ae, d1, d2, d3, ap);
        mf.run();
        TimeControlFrame tcf = new TimeControlFrame(mf);

    }
}
