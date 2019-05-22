package rekkisoft.trongvu.com.retrofitdemo.data.mode;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Owner {
    @SerializedName("reputation")
    private String reputation;
    @SerializedName("user_id")
    private String userId;
    @SerializedName("user_type")
    private String userType;
    @SerializedName("profile_image")
    private String profileImage;
    @SerializedName("display_name")
    private String displayName;
    @SerializedName("link")
    private String link;

//    public Owner() {
//    }

    public String getReputation() {
        return reputation;
    }

    public void setReputation(String reputation) {
        this.reputation = reputation;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getProfileImage() {
        return profileImage;
    }

    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

}
