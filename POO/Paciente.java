public class Paciente {
    String codigo;
    String nome;
    String dataNascimento;
    String sexo;
    String planoSaude;
    String alergia;
    String tipoSanguineo;

        public Paciente(String codigo,String nome,String dataNascimento,String sexo,String planoSaude, String alergia, String tipoSanguineo){

        }



        public void setcodigo(String codigo){
            this.codigo = codigo;

        }

        public String getcodigo(){
          return codigo;

        }

        public void setnome(String nome){
            this.nome = nome;
        }

        public String getnome(){
            return nome;
        }

        public void setdataNascimento(String dataNascimento){
            this.dataNascimento = dataNascimento;
        }
        public String getdataNascimento(){
            return dataNascimento;
        }

        public void setsexo(String sexo){
            this.sexo = sexo;
        }
        public String getsexo(){
            return sexo;
        }
        public void setPlanoSaude(String planoSaude) {
            this.planoSaude = planoSaude;
        }

        public String getPlanoSaude() {
            return planoSaude;
        }

        public void setAlergia(String alergia) {
            this.alergia = alergia;
        }

        public String getAlergia() {
            return alergia;
        }

        public void setTipoSanguineo(String tipoSanguineo) {
            this.tipoSanguineo = tipoSanguineo;
        }

        public String getTipoSanguineo() {
            return tipoSanguineo;
        }


    
    
}
