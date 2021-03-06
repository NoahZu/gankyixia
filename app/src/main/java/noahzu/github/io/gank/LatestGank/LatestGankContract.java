package noahzu.github.io.gank.LatestGank;

import java.util.List;

import noahzu.github.io.gank.Base.BasePresenter;
import noahzu.github.io.gank.Base.BaseView;
import noahzu.github.io.gank.Data.entity.Gank;

/**
 * Created by Administrator on 2016/6/29 0029.
 */
public class LatestGankContract {

    interface View extends BaseView<Presenter>{
        void showGanks(List<Gank> ganks);
        void showGankDetails(Gank gank);
        void showPicture(Gank gank);
    }

    interface Presenter extends BasePresenter{
        void openGank(int position);
    }
}
