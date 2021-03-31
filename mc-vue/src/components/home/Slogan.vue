<template>
  <div>
    <el-card class="box-card">
      <div style="font-size: 45px;color: azure;white-space: nowrap">Here should be a slogan, something like:</div>
      <div style="font-size: 45px;color: azure;white-space: nowrap">Talk is cheap, show me the CODE.</div>
      <a href="https://https://github.com/1170300808/White-Jotter" target="_blank">
        <img src="../../assets/img/icon/icon6.png" alt="" class="git-link">
      </a>
      <a href="mailto:grcamazing@outlook.com" target="_blank">
        <img src="../../assets/img/icon/mail.png" alt="" class="csdn-link">
      </a>
    </el-card>
  </div>
</template>

<script>
  export default {
    name: 'Slogan'
  }
</script>

<style scoped>
  .box-card {
    width: 100%;
    height: 210px;
    background-color: #222;
    text-align: center;
    margin-top: 5px;
  }

  .slogan {
    width: 100%;
  }

  .git-link {
    width: 80px;
    /*position: absolute;*/
  }

  .csdn-link {
    width: 65px;
    /*position: absolute;*/
    margin-bottom: 7px;
    margin-left: 20px;
  }
</style>
