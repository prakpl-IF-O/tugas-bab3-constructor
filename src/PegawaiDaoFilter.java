
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PegawaiDaoFilter {

    private List<Pegawai> list;

    public PegawaiDaoFilter() {
        String[] data = {
            "101,Paijo,2000,1000,500,300",
            "102,Lala,1750,900,500,200",
            "103,Lulu,2150,1000,300,375",
            "104,Sabar,1500,750,600,200",
            "105,Sule,2500,850,500,300",
            "106,Paiman,1500,350,450,250",
            "107,Ponimin,2000,1000,500,200",
            "108,Sutiman,1500,1250,500,300",
            "109,Raja,1000,1000,500,200",
            "110,Harry,2250,1000,200,200"
        };

        list = new ArrayList<>();

        for (String sd : data) {
            String[] expl = sd.split(",");

            Integer nik = Integer.parseInt(expl[0]);
            String nama = expl[1];
            Double gajiPokok = Double.parseDouble(expl[2]);
            Double tunjangan = Double.parseDouble(expl[3]);
            Double bonus = Double.parseDouble(expl[4]);
            Double denda = Double.parseDouble(expl[5]);

            list.add(new Pegawai(nik, nama, gajiPokok, tunjangan, bonus, denda));
        }
    }

    public List<Pegawai> get() {
        return list;
    }

    public Pegawai get(Object nik) {
        List<Pegawai> l = list.stream().filter(p -> p.getNik().equals(nik)).collect(Collectors.toList());
        return (l.size() != 1) ? null : l.get(0);
    }

    public List<Pegawai> get(String colName, Object val) {
        List<Pegawai> res = new ArrayList<>();
        switch (colName) {
            case "nik": {
                res.add(get(val)); break;
            }
            case "nama": {
                res = list.stream().filter(p -> p.getNama().equals(val)).collect(Collectors.toList()); break;
            }
            case "gajiPokok": {
                res = list.stream().filter(p -> p.getGajiPokok().equals(val)).collect(Collectors.toList()); break;
            }
            case "tunjangan": {
                res = list.stream().filter(p -> p.getTunjangan().equals(val)).collect(Collectors.toList()); break;
            }
            case "bonus": {
                res = list.stream().filter(p -> p.getBonus().equals(val)).collect(Collectors.toList()); break;
            }
            case "denda": {
                res = list.stream().filter(p -> p.getDenda().equals(val)).collect(Collectors.toList()); break;
            }
            default: {
                throw new IllegalArgumentException("Unidentified column");
            }
        }
        return res;
    }

    public List<Pegawai> get(String colName, String op, Object val) {
        List<Pegawai> res = new ArrayList<>();
        switch (op) {
            case "=": {
                res = get(colName, val); break;
            }
            case "<=": {
                switch (colName) {
                    case "nik": {
                        res = list.stream().filter(p -> p.getNik() <= (Integer) val).collect(Collectors.toList()); break;
                    }
                    case "nama": {
                        throw new IllegalArgumentException("Column nama not applicable to this operator");
                    }
                    case "gajiPokok": {
                        res = list.stream().filter(p -> p.getGajiPokok() <= (Double) val).collect(Collectors.toList()); break;
                    }
                    case "tunjangan": {
                        res = list.stream().filter(p -> p.getTunjangan() <= (Double) val).collect(Collectors.toList()); break;
                    }
                    case "bonus": {
                        res = list.stream().filter(p -> p.getBonus() <= (Double) val).collect(Collectors.toList()); break;
                    }
                    case "denda": {
                        res = list.stream().filter(p -> p.getDenda() <= (Double) val).collect(Collectors.toList()); break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unidentified column");
                    }
                }
                break;
            }
            case "<": {
                switch (colName) {
                    case "nik": {
                        res = list.stream().filter(p -> p.getNik() < (Integer) val).collect(Collectors.toList()); break;
                    }
                    case "nama": {
                        throw new IllegalArgumentException("Column nama not applicable to this operator");
                    }
                    case "gajiPokok": {
                        res = list.stream().filter(p -> p.getGajiPokok() < (Double) val).collect(Collectors.toList()); break;
                    }
                    case "tunjangan": {
                        res = list.stream().filter(p -> p.getTunjangan() < (Double) val).collect(Collectors.toList()); break;
                    }
                    case "bonus": {
                        res = list.stream().filter(p -> p.getBonus() < (Double) val).collect(Collectors.toList()); break;
                    }
                    case "denda": {
                        res = list.stream().filter(p -> p.getDenda() < (Double) val).collect(Collectors.toList()); break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unidentified column");
                    }
                }
                break;
            }
            case ">=": {
                switch (colName) {
                    case "nik": {
                        res = list.stream().filter(p -> p.getNik() >= (Integer) val).collect(Collectors.toList()); break;
                    }
                    case "nama": {
                        throw new IllegalArgumentException("Column nama not applicable to this operator");
                    }
                    case "gajiPokok": {
                        res = list.stream().filter(p -> p.getGajiPokok() >= (Double) val).collect(Collectors.toList()); break;
                    }
                    case "tunjangan": {
                        res = list.stream().filter(p -> p.getTunjangan() >= (Double) val).collect(Collectors.toList()); break;
                    }
                    case "bonus": {
                        res = list.stream().filter(p -> p.getBonus() >= (Double) val).collect(Collectors.toList()); break;
                    }
                    case "denda": {
                        res = list.stream().filter(p -> p.getDenda() >= (Double) val).collect(Collectors.toList()); break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unidentified column");
                    }
                }
                break;
            }
            case ">": {
                switch (colName) {
                    case "nik": {
                        res = list.stream().filter(p -> p.getNik() > (Integer) val).collect(Collectors.toList());break;
                    }
                    case "nama": {
                        throw new IllegalArgumentException("Column nama not applicable to this operator");
                    }
                    case "gajiPokok": {
                        res = list.stream().filter(p -> p.getGajiPokok() > (Double) val).collect(Collectors.toList()); break;
                    }
                    case "tunjangan": {
                        res = list.stream().filter(p -> p.getTunjangan() > (Double) val).collect(Collectors.toList()); break;
                    }
                    case "bonus": {
                        res = list.stream().filter(p -> p.getBonus() > (Double) val).collect(Collectors.toList()); break;
                    }
                    case "denda": {
                        res = list.stream().filter(p -> p.getDenda() > (Double) val).collect(Collectors.toList()); break;
                    }
                    default: {
                        throw new IllegalArgumentException("Unidentified column");
                    }
                }
                break;
            }
            default: {
                throw new IllegalArgumentException("Unidentified operator");
            }
        }
        return res;
    }
    
    // use library
    public void print(Object l) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        System.out.println(gson.toJson(l)+"\n\n");
    }
}
