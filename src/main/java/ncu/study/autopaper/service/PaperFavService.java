package ncu.study.autopaper.service;

/**
 * @author Ridup
 * @version FleName:  PaperFavService .java  v0.1  2018/5/17 18:14 Exp $
 */
public interface PaperFavService {
    public Boolean isFav(int userId, int paperId);

    public int favPaper(int userId, int paperId);

    public int cancleFav(int userId, int paperId);
}
