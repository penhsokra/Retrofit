package camdev.sothoeun.asia.retrofitdemo.model.respone;

import com.google.gson.annotations.SerializedName;

import java.util.List;

import camdev.sothoeun.asia.retrofitdemo.model.Category;
import camdev.sothoeun.asia.retrofitdemo.model.Pagination;

public class Respone {
    @SerializedName("CODE")
    private String cod;
    @SerializedName("MESSAGE")
    private String message;
    @SerializedName("DATA")
    private List<Category> categories;
    @SerializedName("PAGINATION")
    private Pagination paginations;

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public List<Category> getCategories() {
        return categories;
    }

    public void setCategories(List<Category> categories) {
        this.categories = categories;
    }

    public Pagination getPaginations() {
        return paginations;
    }

    public void setPaginations(Pagination paginations) {
        this.paginations = paginations;
    }

    @Override
    public String toString() {
        return "Respone{" +
                "cod='" + cod + '\'' +
                ", message='" + message + '\'' +
                ", categories=" + categories +
                ", paginations=" + paginations +
                '}';
    }
}
